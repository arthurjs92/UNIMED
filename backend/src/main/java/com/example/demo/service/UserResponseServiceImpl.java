package com.example.demo.service;

import com.example.demo.handler.UserResponseNotFound;
import com.example.demo.model.UserResponse;
import com.example.demo.repository.UserResponseRepository;
import com.example.demo.service.impl.UserResponseService;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class UserResponseServiceImpl implements UserResponseService {

    private final UserResponseRepository userResponseRepository;

    public UserResponseServiceImpl(UserResponseRepository userResponseRepository) {
        this.userResponseRepository = userResponseRepository;
    }

    @Override
    public UserResponse saveUserResponse(UserResponse userResponse) throws Exception {
        sendingEmail(userResponse);
        return userResponseRepository.save(userResponse);
    }

    @Override
    public UserResponse findUserResponseById(Long id) {
        return userResponseRepository.findById(id).orElseThrow(() -> new UserResponseNotFound(id));
    }

    @Override
    public List<UserResponse> findAllUsersResponse() {
        return userResponseRepository.findAll();
    }

    @Override
    public UserResponse updateUserResponse(UserResponse userResponse, Long id) {
        return userResponseRepository.findById(id).map(response -> {
            response.setNome(userResponse.getNome());
            return userResponseRepository.save(response);
        }).orElseGet(() -> {
            userResponse.setId(id);
            return userResponseRepository.save(userResponse);
        });
    }

    @Override
    public void deleteUserReponse(Long id) {
        userResponseRepository.deleteById(id);
    }

    public void sendingEmail(UserResponse userResponse) throws Exception {
        Email from = new Email("ajsantos5d@hotmail.com");
        String subject = "Sending with SendGrid is Fun";
        Email to = new Email(userResponse.getEmail());
        System.out.println(userResponse.getEmail());
        Content content = new Content("text/plain", userResponse.toString());
        Mail mail = new Mail(from, subject, to, content);

        SendGrid sg = new SendGrid(System.getenv("SENDGRID_API_KEY"));
        Request request = new Request();
        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            Response response = sg.api(request);
            System.out.println(response.getStatusCode());
            System.out.println(response.getBody());
            System.out.println(response.getHeaders());
        } catch (IOException ex) {
            throw ex;
        }
    }
}
