package com.gtbr.xmlpractice.service;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.gtbr.xmlpractice.model.User;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class ParserService {

    public User parseUser() throws IOException {
        File file = new File("src/main/resources/static/teste.xml");
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(inputStreamToString(new FileInputStream(file)), User.class);
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
