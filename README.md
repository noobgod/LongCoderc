# LongCoderc
对Long类型的数字进行加解密，加密的结果是随机字符

# 示例

```java
public static void main(String[] args) {
    System.out.println(IdEncrypter.decrypt("_pnOgexx_kECFpWMnYHg2A"));
    System.out.println(IdEncrypter.encrypt(705L));
    System.out.println(IdEncrypter.encrypt(708708144230092812L));
}
```
输出

```java
710541144794071040
UMlLFBQulMY
HLTXw7VLVGAtSYRZ1NFSSU
```

# 有什么用处？

数据库中的自增ID一般定义为Bigint类型，对应Java的Long，但是由于数据安全的原因后端是不能将ID直接返回给前端的，通过这种加解密的方式可以保证数据的安全性。
