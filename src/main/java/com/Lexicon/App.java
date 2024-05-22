package com.Lexicon;

import com.Lexicon.Config.ComponentScanConfig;
import com.Lexicon.Data_access.StudentDao;
import com.Lexicon.Service.StudentManagement;
import com.Lexicon.Service.StudentManagementConsoleImpl;
import com.Lexicon.Util.UserInputService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        StudentDao studentDao = context.getBean(StudentDao.class);
        StudentManagement studentManagement = context.getBean(StudentManagementConsoleImpl.class);
        System.out.println("StudentManagement:" + studentManagement);


    context.close();
        /*AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(StudentManagementConsoleImpl.class);
        UserInputService userInputService =context.getBean(UserInputService.class);

         */

    }
}
