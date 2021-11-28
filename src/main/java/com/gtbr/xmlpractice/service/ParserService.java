package com.gtbr.xmlpractice.service;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.gtbr.xmlpractice.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.*;

@Slf4j
@Service
public class ParserService {

    public User parseUser() throws IOException {
        File file = new File("src/main/resources/static/teste.xml");
        XmlMapper xmlMapper = new XmlMapper();
        User user = xmlMapper.readValue(inputStreamToString(new FileInputStream(file)), User.class);
        log.info("{}", user.getRace().getRaceType());
        log.info("{}", user.getUserType().get("type"));
        return user;
    }

    public String inputStreamToString(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }

}
