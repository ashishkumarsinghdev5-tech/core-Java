package StreamAplExample;

import java.beans.Encoder;

import java.security.MessageDigest;
import java.util.Base64;

public class Demo18
{
    public static void main(String[] args) throws Exception
    {// massage digest class available (SHA- 256)
        String pwd = " Ashish@123";
        MessageDigest md =  MessageDigest.getInstance ("SHA-256");
        byte[] digest = md.digest(pwd .getBytes());
        String encrypted = new String(digest);
        System.out.println("Encrypted password ::  " + encrypted );

       Base64 .Encoder encoder = Base64.getEncoder();
        byte[] encode = encoder.encode (digest);
        System.out.println("Encrypted password + Encoded :: " + new String(encode));

        // converting String to byte [] and passing as input for encode () method
        // original password (String pass )
      /* Base64.Encoder  encoder = Base64.getEncoder();
        // converting byte [] to  String
        byte[] encode = encoder.encode(pwd.getBytes()); // byte coder array assume
        String encodePwd = new String(encode);
        System.out.println(encodePwd);

        // decode the password as it is
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decode = decoder .decode(encodePwd);
        String decodedPwd = new String(decode);
        System.out.println(decodedPwd); */
    }
}
