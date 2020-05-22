/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rsukh
 */
public class studentList {
    public static void main (String []args){
        //create an array of students 
        student []sList=new student[5];
        
        //put names in the array
        for (int i=0;i<=sList.length-1;i++){
            sList[i]=new student();
            sList[i].setName("student"+(i+1));
            
        }
        // print the array
        for (student s:sList){
            System.out.println("student name is :"+s.getName());
        }
    }
    
}
