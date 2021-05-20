package com.jianjian.longcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wujiajian776
 * @Date: create at 2020/11/29 3:01 下午
 * @Description:
 */
public class IdEncrypter {

    public static String encrypt(Long id) {
        if(id == null) {
            throw new RuntimeException("系统异常!");
        }
        return IdEncrypterForjava.encodeLong(id);
    }

    public static long decrypt(String code) {
        return IdEncrypterForjava.decode(code);
    }

    public static List<Long> decryptList(List<String> list){
        List<Long> ids = new ArrayList<Long>();
        list.forEach(t->{
            long id = IdEncrypterForjava.decode(t);
            if (id == 0) {
                throw new RuntimeException("系统异常!");
            }
            ids.add(id);
        });
        return ids;
    }

    public static void main(String[] args) {
        System.out.println(IdEncrypter.encrypt(710541144794071040L));
        System.out.println(IdEncrypter.decrypt("_pnOgexx_kECFpWMnYHg2A"));
        System.out.println(IdEncrypter.encrypt(364904448L));
        System.out.println(IdEncrypter.decrypt("2EYTGnIZrTE"));
        System.out.println(IdEncrypter.encrypt(705L));
        System.out.println(IdEncrypter.decrypt("UMlLFBQulMY"));
    }
}
