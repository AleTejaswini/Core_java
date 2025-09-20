package learningsystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CourseManager cm = new CourseManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("---Dmantz Learning System---");
            System.out.println("1. Subject Area");
            System.out.println("2. Course");
            System.out.println("3. Chapters");
            System.out.println("4. Topics");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("\n---Subject Area Menu---");
                        System.out.println("1. Add Subject Area");
                        System.out.println("2. Get All Subject Areas");
                        System.out.println("3. Check if Subject Area is Available");
                        System.out.println("4. Update Subject Area");
                        System.out.println("5. Delete Subject Area");
                        System.out.println("6. Back to Main Menu");
                        System.out.println("Enter your choice");
                        int subChoice = sc.nextInt();
                        sc.nextLine();

                        if (subChoice == 6) break; 

                        switch (subChoice) {
                            case 1:
                                System.out.println("Enter subject id:");
                                int subjectid = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Enter subject name:");
                                String subjectname = sc.nextLine();
                                cm.addSubjectArea(subjectid, subjectname);
                                break;
                            case 2:
                                cm.getAllSubjectAreas();
                                break;
                            case 3:
                                System.out.println("Enter subject ID to check:");
                                int checkSubID = sc.nextInt();
                                cm.isSubjectAreaAvailable(checkSubID);
                                break;
                            case 4:
                                System.out.println("Enter id to update:");
                                int updateSubID = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Enter new subject name:");
                                String newSubname = sc.nextLine();
                                cm.updateSubjectArea(updateSubID, newSubname);
                                break;
                            case 5:
                                System.out.println("Enter subject ID to delete:");
                                int deleteSubid = sc.nextInt();
                                cm.deleteSubjectArea(deleteSubid);
                                break;
                            default:
                                System.out.println("Invalid choice!");
                        }
                    }
                    break;

                case 2: 
                    while (true) {
                        System.out.println("\n--- Course Menu ---");
                        System.out.println("1. Add Course");
                        System.out.println("2. Get All Courses");
                        System.out.println("3. Check if Course is Available");
                        System.out.println("4. Update Course");
                        System.out.println("5. Delete Course");
                        System.out.println("6. Back to Main Menu");
                        System.out.println("Enter your choice");
                        int courseChoice = sc.nextInt();
                        sc.nextLine();

                        if (courseChoice == 6) break;

                        switch (courseChoice) {
                            case 1:
                                System.out.println("Enter Course id:");
                                int courseID = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Enter Course name:");
                                String coursename = sc.nextLine();
                                System.out.println("Enter SubjectArea Id:");
                                int subId = sc.nextInt();
                                cm.addCourse(courseID, coursename, subId);
                                break;
                            case 2: cm.getAllCourses(); break;
                            case 3:
                                System.out.println("Enter Course ID to check:");
                                int checkCourseID = sc.nextInt();
                                cm.isCourseAvailable(checkCourseID);
                                break;
                            case 4:
                                System.out.println("Enter Course ID to update:");
                                int updateCourseID = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Enter new Course name:");
                                String newCoursename = sc.nextLine();
                                cm.updateCourse(updateCourseID, newCoursename);
                                break;
                            case 5:
                                System.out.println("Enter Course ID to delete:");
                                int deleteCourseid = sc.nextInt();
                                cm.deleteCourse(deleteCourseid);
                                break;
                            default: System.out.println("Invalid choice!");
                        }
                    }
                    break;

                case 3: 
                    while (true) {
                        System.out.println("\n--- Chapter Menu ---");
                        System.out.println("1. Add Chapter");
                        System.out.println("2. Get All Chapters");
                        System.out.println("3. Check if Chapter is Available");
                        System.out.println("4. Update Chapter");
                        System.out.println("5. Delete Chapter");
                        System.out.println("6. Back to Main Menu");
                        System.out.println("Enter your choice");
                        int chapChoice = sc.nextInt();
                        sc.nextLine();

                        if (chapChoice == 6) break;

                        switch (chapChoice) {
                            case 1:
                                System.out.println("Enter Chapter id:");
                                int chapterID = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Enter Chapter name:");
                                String chaptername = sc.nextLine();
                                System.out.println("Enter Course Id:");
                                int courseId = sc.nextInt();
                                cm.addChapter(chapterID, chaptername, courseId);
                                break;
                            case 2: cm.getAllChapters(); break;
                            case 3:
                                System.out.println("Enter Chapter ID to check:");
                                int checkChapterID = sc.nextInt();
                                cm.isChapterAvailable(checkChapterID);
                                break;
                            case 4:
                                System.out.println("Enter Chapter ID to update:");
                                int updateChapterID = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Enter new Chapter name:");
                                String newChaptername = sc.nextLine();
                                cm.updateChapter(updateChapterID, newChaptername);
                                break;
                            case 5:
                                System.out.println("Enter Chapter ID to delete:");
                                int deleteChapterid = sc.nextInt();
                                cm.deleteChapter(deleteChapterid);
                                break;
                            default: System.out.println("Invalid choice!");
                        }
                    }
                    break;

                case 4: 
                    while (true) {
                        System.out.println("\n--- Topic Menu ---");
                        System.out.println("1. Add Topic");
                        System.out.println("2. Get All Topics");
                        System.out.println("3. Check if Topic is Available");
                        System.out.println("4. Update Topic");
                        System.out.println("5. Delete Topic");
                        System.out.println("6. Back to Main Menu");
                        System.out.println("Enter your choice");
                        int topicChoice = sc.nextInt();
                        sc.nextLine();

                        if (topicChoice == 6) break;

                        switch (topicChoice) {
                            case 1:
                                System.out.println("Enter Topic id:");
                                int topicID = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Enter Topic name:");
                                String topicname = sc.nextLine();
                                System.out.println("Enter Chapter Id:");
                                int chapterId = sc.nextInt();
                                cm.addTopic(topicID, topicname, chapterId);
                                break;
                            case 2: cm.getAllTopics(); break;
                            case 3:
                                System.out.println("Enter Topic ID to check:");
                                int checkTopicID = sc.nextInt();
                                cm.isTopicAvailable(checkTopicID);
                                break;
                            case 4:
                                System.out.println("Enter Topic ID to update:");
                                int updateTopicID = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Enter new Topic name:");
                                String newTopicname = sc.nextLine();
                                cm.updateTopic(updateTopicID, newTopicname);
                                break;
                            case 5:
                                System.out.println("Enter Topic ID to delete:");
                               
                                int deleteTopicid = sc.nextInt();
                                
                                cm.deleteTopic(deleteTopicid);
                                break;
                            default: System.out.println("Invalid choice!");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please enter correct option.");
            }
        }
    }
}
