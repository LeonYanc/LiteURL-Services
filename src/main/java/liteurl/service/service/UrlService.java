package liteurl.service.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import liteurl.service.entity.Url;
import liteurl.service.repository.UrlRepository;

@Service
public class UrlService {

    @Autowired
    UrlRepository urlRepository;

    public List<Url> getAllUrl() {
        return urlRepository.findAll();
    }

    public String filterUrl(String oUrl) {
        // TODO Auto-generated method stub
        StringBuilder res = new StringBuilder();
        for (char ele : oUrl.toCharArray()) {
            if (((int) ele > (int) 'a' && (int) ele < (int) 'z') || ((int) ele > (int) 'A' && (int) ele < (int) 'Z'))
                res.append(ele);
        }
        return res.toString();
    }

    public String createUrl(String filterUrl, String originalUrl) {
        // TODO Auto-generated method stub
        List<Url> allUrl = getAllUrl();
        Set<String> uniqueSet = new HashSet();
        allUrl.forEach(u -> uniqueSet.add(u.getOutputurl()));
        String res = "liteurl.com/";
        StringBuilder sb = new StringBuilder();
        while (true) {
            for (int i = 0; i < 6; i++) {
                sb.append(filterUrl.charAt(new Random().nextInt(filterUrl.length())));
            }
            res = res + sb;
            if (!uniqueSet.contains(sb)) {
                break;
            }else {
                res = "liteurl.com/";
            }
        }
        Url newUrl = new Url(originalUrl, res);
        newUrl.setId(2);
        urlRepository.save(newUrl);
        return res;
    }
}