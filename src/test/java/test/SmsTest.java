package test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;

public class SmsTest {

   /* class smsGateway{
        static void send(sms sms){}
    }
    class sms{
        public sms(String numerTel, String trescSms) {
        }
    } */
    public void wyslijSms(String numerTel, String trescSms) {
     //   smsGateway.send(new sms(numerTel, trescSms));
    }

    ///////////////////////////////////////////////// #1
    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void testWyjatkuSms1() {
        exception.expect(SMSGatewayException.class);
        wyslijSms("517417413", "StażystaAleksander");
    }
    ////////////////////////////////////////////////// #2
    @Test(expected = SMSGatewayException.class)
    public void testWyjatkuSms2() throws Exception {
        wyslijSms("517417413", "StażystaAleksander");
    }
}
 class SMSGatewayException extends Exception{
    public SMSGatewayException(String komunikat){
        super(komunikat);
    }
}
