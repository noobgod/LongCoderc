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
        if (id == null) {
            throw new RuntimeException("系统异常!");
        }
        return IdEncrypterForjava.encodeVid(id.intValue());
    }

    public static long decrypt(String code) {
        return IdEncrypterForjava.decodeVid(code);
    }

    public static List<Long> decryptList(List<String> list) {
        List<Long> ids = new ArrayList<Long>();
        list.forEach(t -> {
            long id = IdEncrypter.decrypt(t);
            if (id == 0) {
                throw new RuntimeException("系统异常!");
            }
            ids.add(id);
        });
        return ids;
    }

    public static void main(String[] args) {
        System.out.println(IdEncrypter.decrypt("_pnOgexx_kECFpWMnYHg2A"));
        System.out.println(IdEncrypter.encrypt(705L));
        System.out.println(IdEncrypter.encrypt(706L));
        System.out.println(IdEncrypter.encrypt(707L));
        System.out.println(IdEncrypter.encrypt(708708144225898498L));
        System.out.println(IdEncrypter.encrypt(708708144230092812L));
    }
}
