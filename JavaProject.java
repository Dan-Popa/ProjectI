package ex01;

import java.util.LinkedList;
public class JavaProject {
    public static void main(String[] args) {
String mem;
        MembershipManagment mm = new MembershipManagment();//obj
        FileHandler fh = new FileHandler();//store in file
LinkedList<Member> members = fh.readFile(); int choice = mm.getChoice();//list of members
while (choice != -1) {
            switch (choice)
            {
case 1:
mem = mm.addMembers(members); fh.appendFile(mem);
break;
case 2: mm.removeMember(members); fh.overwriteFile(members); break;
case 3: mm.printMemberInfo(members); break;
default:
System.out.print("\nYou have selected an invalid option.\n\n"); break;
}
choice = mm.getChoice(); }
System.out.println("\nGood Bye"); }
}