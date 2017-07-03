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
//    	Stack<String> ops = new Stack<String>(); //操作符栈  
//        Stack<Double> vals = new Stack<Double>(); //操作数栈  
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
//            else if(s.equals(")")){//如果是 ）弹出操作符和操作数，计算结果并压入栈  
//                String op = ops.pop();  
//                System.out.println(op+"我是op操作");
//                double v = vals.pop(); 
//                System.out.println(v+"我是v操作");
//                if(op.equals("+")) v=vals.pop()+v;  
//                else if(op.equals("-")) v=vals.pop()-v;  
//                else if(op.equals("*")) v=vals.pop()*v;  
//                else if(op.equals("/")) v=vals.pop()/v;  
//                vals.push(v);  
//            }  
//           
//            else {
//            	System.out.println(s+"我是vas操作");
//             vals.push(Double.parseDouble(s));  }
//            	
//        }  
//        System.out.println(vals.pop()); 
    }  
  
}  