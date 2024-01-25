
package university_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener{
    Project(){
     setSize(1540,850);
     
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 =i1.getImage().getScaledInstance(1500, 700, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
	JLabel image = new JLabel(i3);
	add(image);
     
     JMenuBar mb = new JMenuBar();
     
     JMenu newInformation = new JMenu("New Information");
     newInformation.setForeground(Color.BLUE);
     mb.add(newInformation);
     
     JMenuItem facultyinfo = new JMenuItem("New Faculty Information");
     facultyinfo.setBackground(Color.WHITE);
     facultyinfo.addActionListener(this);
     newInformation.add(facultyinfo);
     
     
     JMenuItem studentinfo = new JMenuItem("New Student Information");
     studentinfo.setBackground(Color.WHITE);
     studentinfo.addActionListener(this);
     newInformation.add(studentinfo);
     
     JMenu details = new JMenu("View Details");
     details.setForeground(Color.RED);
     mb.add(details);
     
     JMenuItem facultydetails = new JMenuItem("View Faculty details");
     facultydetails.setBackground(Color.WHITE);
     facultydetails.addActionListener(this);
     details.add(facultydetails);
     
     
     JMenuItem studentdetails = new JMenuItem("View student details");
     studentdetails.setBackground(Color.WHITE);
     studentdetails.addActionListener(this);
     details.add(studentdetails);
     
     
     //Leave
     JMenu leave = new JMenu("Apply Leave");
     leave.setForeground(Color.BLUE);
     mb.add(leave);
     
     JMenuItem facultyleave = new JMenuItem("Faculty Leave");
     facultyleave.setBackground(Color.WHITE);
     facultyleave.addActionListener(this);
     leave.add(facultyleave);
     
     
     JMenuItem studentleave = new JMenuItem("student Leave");
     studentleave.setBackground(Color.WHITE);
     studentleave.addActionListener(this);
     leave.add(studentleave);
     
     
     //LeaveDetails
     JMenu leaveDetails = new JMenu("LeaveDetails");
     leaveDetails.setForeground(Color.RED);
     mb.add(leaveDetails);
     
     JMenuItem facultyleaveDetails = new JMenuItem("Faculty leaveDetails");
     facultyleaveDetails.setBackground(Color.WHITE);
     facultyleaveDetails.addActionListener(this);
     leaveDetails.add(facultyleaveDetails);
     
     
     JMenuItem studentleaveDetails = new JMenuItem("student leaveDetails");
     studentleaveDetails.setBackground(Color.WHITE);
     studentleaveDetails.addActionListener(this);
     leaveDetails.add(studentleaveDetails);
     
     
     
     //Exams
     JMenu exam = new JMenu("Examination");
     exam.setForeground(Color.BLUE);
     mb.add(exam);
     
     JMenuItem examinationDetails = new JMenuItem("Examination Results");
     examinationDetails .setBackground(Color.WHITE);
     examinationDetails.addActionListener(this);
     exam.add(examinationDetails );
     
     
     JMenuItem entermarks = new JMenuItem("Enter Marks");
     entermarks.setBackground(Color.WHITE);
     entermarks.addActionListener(this);
     exam.add(entermarks);
     
     
     //updateinfo
     JMenu updateinfo= new JMenu("Update Details");
     updateinfo.setForeground(Color.RED);
     mb.add(updateinfo);
     
     JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details");
     updatefacultyinfo.setBackground(Color.WHITE);
     updatefacultyinfo.addActionListener(this);
     updateinfo.add(updatefacultyinfo );
     
     
     JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
     updatestudentinfo.setBackground(Color.WHITE);
     updatestudentinfo.addActionListener(this);
     updateinfo.add(updatestudentinfo);
     
     //fee
     JMenu fee= new JMenu("Fee Details");
     fee.setForeground(Color.BLUE);
     mb.add(fee);
     
     JMenuItem feestructure = new JMenuItem("Fee Structure");
     feestructure.setBackground(Color.WHITE);
     fee.add(feestructure );
     
     
     JMenuItem feeform = new JMenuItem("Student FeeForm");
     feeform.setBackground(Color.WHITE);
     fee.add(feeform);
     
     //Utility
     JMenu utility= new JMenu("Utility");
     utility.setForeground(Color.RED);
     mb.add(utility);
     
     JMenuItem notepad = new JMenuItem("Notepad");
     notepad.setBackground(Color.WHITE);
     notepad.addActionListener(this);
     utility.add(notepad);
     
     
     JMenuItem calc = new JMenuItem("Calculator");
     calc.setBackground(Color.WHITE);
     calc.addActionListener(this);
     utility.add(calc);
     
     
     //Exit
     JMenu exit= new JMenu("Exit");
     exit.setForeground(Color.BLUE);
     mb.add(exit);
     
     JMenuItem ex = new JMenuItem("Exit");
     ex.setBackground(Color.WHITE);
     ex.addActionListener(this);
     exit.add(ex);
     
     
     
     
     setJMenuBar(mb);
     getContentPane().setBackground(Color.BLACK); 
     setVisible(true);
     
    }
     public void  actionPerformed(ActionEvent ae){
    
         String msg = ae.getActionCommand();
         
         if(msg.equals("Exit")){
         setVisible(false);
         }
        else if(msg.equals("Calculator")){
         try{
           Runtime.getRuntime().exec("calc.exe");
         }catch(Exception e){
         
         }
         }
         else if(msg.equals("Notepad")){
         try{
           Runtime.getRuntime().exec("notepad.exe");
         }catch(Exception e){
         
         }
         }
         else if(msg.equals("New Faculty Information")){
           new AddTeacher();
         }
         else if(msg.equals("New Student Information")){
           new AddStudent();
         }
         else if(msg.equals("View Faculty details")){
           new TeacherDetails();
         }
         else if(msg.equals("View student details")){
           new StudentDetails();
         }
         else if(msg.equals("Faculty Leave")){
           new TeacherLeave();
         }
         else if(msg.equals("student Leave")){
           new StudentLeave();
         }
         else if(msg.equals("Faculty leaveDetails")){
           new TeacherLeaveDetails();
         }
         else if(msg.equals("student leaveDetails")){
           new StudentLeaveDetails();
         }
         else if(msg.equals("Update Faculty Details")){
           new UpdateTeacher();
         }
         else if(msg.equals("Update Student Details")){
           new UpdateStudent();
         }
         else if(msg.equals("Enter Marks")){
           new EnterMarks();
         }
          else if(msg.equals("Examination Results")){
           new ExaminationDetails();
         }
    }
    
    
   
    public static void main(String[] args){
    new Project();
    
    }
}
