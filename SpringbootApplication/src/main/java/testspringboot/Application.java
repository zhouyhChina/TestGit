package testspringboot;
import java.util.Stack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/** 
 * zyh
 */  
//@SpringBootApplication
@Configuration
@EnableAutoConfiguration 
@ComponentScan
public class Application {  
    public static void main(String[] args) throws Exception {  
    	SpringApplication.run(Application.class, args);
//    	Stack<String> ops = new Stack<String>(); //������ջ  
//        Stack<Double> vals = new Stack<Double>(); //������ջ  
//        String str = "(1+(3*4)+3)";
//        char[] arr = str.toCharArray();  
//        for(char c : arr){   
//            String s =c+"";  
//            if(s.equals(""));  
//            else if(s.equals("(")) ops.push(s);  
//            else if(s.equals("+")) ops.push(s);  
//            else if(s.equals("-")) ops.push(s);  
//            else if(s.equals("*")) ops.push(s);  
//            else if(s.equals("/")) ops.push(s);  
//            else if(s.equals(")")){//����� �������������Ͳ���������������ѹ��ջ  
//                String op = ops.pop();  
//                System.out.println(op+"����op����");
//                double v = vals.pop(); 
//                System.out.println(v+"����v����");
//                if(op.equals("+")) v=vals.pop()+v;  
//                else if(op.equals("-")) v=vals.pop()-v;  
//                else if(op.equals("*")) v=vals.pop()*v;  
//                else if(op.equals("/")) v=vals.pop()/v;  
//                vals.push(v);  
//            }  
//           
//            else {
//            	System.out.println(s+"����vas����");
//             vals.push(Double.parseDouble(s));  }
//            	
//        }  
//        System.out.println(vals.pop()); 
    }  
  
}  