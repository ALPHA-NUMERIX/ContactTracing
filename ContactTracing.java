package worlds;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class ddd{
	public static void main(String [] args) throws Exception {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name, contactNumber, emailAddress;
        int c = 0, a = 3;

        System.out.println("Hello! This is Your DCIT 23C Contact Tracing Form:\n");

        while (c < a) {

            System.out.print("Enter Your Name: ");
            name = br.readLine();
            System.out.print("Enter Your Contact Number: ");
            contactNumber = br.readLine();
            System.out.print("Enter Your Email Address: ");
            emailAddress = br.readLine();

            if (!name.isEmpty() && !contactNumber.isEmpty() && !emailAddress.isEmpty()) {
                c += 3;

                int y = 0;
                int Origin; 

                System.out.print("\nPlace of origin:\n[1]Philippines\n[2]Other Countries(Kindly specify)\nEnter place of Origin: ");
                Origin = Integer.parseInt(br.readLine());
               
                if (Origin == 1) {
                    System.out.println("\nPlace in Philippines:\n[1]NCR + Bubble\n[2]Other areas(Kindly Specify)");

                    int place;
                    System.out.print("Enter Area of Your Origin: ");
                    place= Integer.parseInt(br.readLine());

                    if (place== 1) {
                        System.out.println("\nYOU WILL UNDER GO IN A 14 DAYS QUARANTINE  DUE TO YOUR PLACE OF ORIGIN.");
                        int NCR= 1; 
                        byte numOfYes = 0, numOfNo = 0;
                        int answer; 

                        for (NCR= 1; NCR < 15; NCR++) {
                            System.out.print("Day - " + NCR+ " Having Any symptoms? [1]Yes [2]No\nEnter Choice here:");
                            answer = Integer.parseInt(br.readLine());

                            if (answer != 1 && answer != 2) {
                                String yes2 = "a";
                                String no2 = "b";
                                byte z = 0;


                                while (z < 3) {

                                    String again;
                                    System.out.print("\nFill up the form again?\nA.Yes,please\nB.No.Thanks\nEnter choice:");
                                    again = br.readLine();

                                    if (again.equalsIgnoreCase(yes2)) {
                                        z += 3;
                                        y += 3;
                                    } 

                                    else if (again.equalsIgnoreCase(no2)) {
                                        z += 3;
                                        c += 3;
                                        y += 3;
                                        break;
                                    } 

                                    else {
                                        System.out.println("Invalid Input");
                                        c += 3;
                                        y += 0;
                                    } 

                                } 
                            } 

                            else if (answer % 2 == 1) {
                                numOfYes++;
                            } else {
                                numOfNo++;
                            }


                        } 

                        if (numOfNo == 14) {
                            System.out.println("\nEND OF YOUR QUARANTINE");
                            System.out.println("Result:\nName: " + name + "\nContact Number:" + contactNumber + "\nEmail Address:" + emailAddress);
                            System.out.println("Place of Origin: " + "NCR + Bubble" + ",Philippines");
                            System.out.println("Case Category: Asymptomatic");
                            break;
                        } else if (numOfYes <= 7) {
                            System.out.println("\nEND OF YOUR QUARANTINE");
                            System.out.println("Result:\nName: " + name + "\nContact Number: " + contactNumber + "\nEmail Address: " + emailAddress);
                            System.out.println("Place of Origin: " + "NCR + Bubble" + ",Philippines");
                            System.out.println("Case Category: Mild");
                            break;
                        } else if (numOfYes > 7) {
                            System.out.println("\nEND OF YOUR QUARANTINE");
                            System.out.println("Result:\nName: " + name + "\nContact Number: " + contactNumber + "\nEmail Address: " + emailAddress);
                            System.out.println("Place of Origin: " + "NCR + Bubble" + ",Philippines");
                            System.out.println("Case Category: Severe");
                            break;
                        }
                    } 

                    else if (a == 2) {
                        System.out.println("\nYOU WILL UNDERGO IN A 7 DAYS QUARANTINE  DUE TO YOUR PLACE OF ORIGIN.");
                        String specificArea;
                        System.out.print("Enter Specific Area:");
                        specificArea = br.readLine();
                        byte NCRnumOfDays = 1;
                        byte numOfYes = 0, numOfNo = 0;
                        byte answer;

                        for (NCRnumOfDays = 1; NCRnumOfDays < 8; NCRnumOfDays++) {

                            System.out.print("Day - " + NCRnumOfDays + " Having Any symptoms? [1]Yes [2]No\nEnter Choice here:");
                            answer = Byte.parseByte(br.readLine());

                            if (answer != 1 && answer != 2) {
                                String yes2 = "a";
                                String no2 = "b";
                                byte z = 0;

                                while (z < 3) {

                                    String again;
                                    System.out.print("\nFill up the form again?\nA.Yes,please\nB.No.Thanks\nEnter choice:");
                                    again = br.readLine();

                                    if (again.equalsIgnoreCase(yes2)) {
                                        z += 3;
                                        y += 3;
                                    } else if (again.equalsIgnoreCase(no2)) {
                                        z += 3;
                                        c += 3;
                                        y += 3;
                                        break;
                                    } else {
                                        System.out.println("Invalid Input");
                                        c += 3;
                                        y += 0;
                                    }

                                } 

                            }

                            else if (answer % 2 == 1) {
                                numOfYes++;
                            } 
                            else {
                                numOfNo++;
                            }
                        } 

                        if (numOfNo == 14) {
                            System.out.println("\nEND OF YOUR QUARANTINE");
                            System.out.println("Result:\nName:" + name + "\nContact Number:" + contactNumber + "\nEmail Address:" + emailAddress);
                            System.out.println("Place of Origin: " + specificArea + ",Philippines");
                            System.out.println("Case Category: Asymptomatic");
                            break;
                        } else if (numOfYes <= 7) {
                            System.out.println("\nEND OF YOUR QUARANTINE");
                            System.out.println("Result:\nName: " + name + "\nContact Number: " + contactNumber + "\nEmail Address: " + emailAddress);
                            System.out.println("Place of Origin: " + specificArea + ",Philippines");
                            System.out.println("Case Category: Mild");
                            break;
                        } else if (numOfYes > 7) {
                            System.out.println("\nEND OF YOUR QUARANTINE");
                            System.out.println("Result:\nName: " + name + "\nContact Number: " + contactNumber + "\nEmail Address: " + emailAddress);
                            System.out.println("Place of Origin: " + specificArea + ",Philippines");
                            System.out.println("Case Category: Severe");
                            break;
                        }
                    } 
                } 

                else if (a == 2) {
                    String specificCountry;
                    System.out.print("Enter Specific Country: ");
                    specificCountry = br.readLine();
                    System.out.println("\nYOU WILL UNDER GO IN A  21 DAYS QUARANTINE  DUE TO YOUR PLACE OF ORIGIN.");
                    byte OCnumOfDays = 1;
                    byte totalOfYes = 0, totalOfNo = 0;
                    byte answer2;

                    for (OCnumOfDays = 1; OCnumOfDays < 22; OCnumOfDays++) {

                        System.out.print("Day - " + OCnumOfDays + " Having Any symptoms? [1]Yes [2]No\nEnter Choice here:");
                        answer2 = Byte.parseByte(br.readLine());

                        if (answer2 != 1 && answer2 != 2) {
                            String yes2 = "a";
                            String no2 = "b";
                            byte z = 0;

                            while (z < 3) {

                                String again;
                                System.out.print("\nFill up the form again?\nA.Yes,please\nB.No.Thanks\nEnter choice:");
                                again = br.readLine();

                                if (again.equalsIgnoreCase(yes2)) {
                                    z += 3;
                                    y += 3;
                                } else if (again.equalsIgnoreCase(no2)) {
                                    z += 3;
                                    c += 3;
                                    y += 3;
                                    break;
                                } else {
                                    System.out.println("Invalid Input");
                                    c += 3;
                                    y += 0;
                                }
                            }


                        } 

                        else if (answer2 % 2 == 1) {
                            totalOfYes++;
                        } else if (answer2 % 2 == 0) {
                            totalOfNo++;
                        }
                    } 
                    if (totalOfNo == 21) {
                        System.out.println("\nEND OF YOUR QUARANTINE");
                        System.out.println("Result:\nName:" + name + "\nContact Number:" + contactNumber + "\nEmail Address:" + emailAddress);
                        System.out.println("Place of Origin: " + specificCountry);
                        System.out.println("Case Category: Asymptomatic");
                        break;
                    } else if (totalOfYes <= 14) {
                        System.out.println("\nEND OF YOUR QUARANTINE");
                        System.out.println("Result:\nName: " + name + "\nContact Number: " + contactNumber + "\nEmail Address: " + emailAddress);
                        System.out.println("Place of Origin: " + specificCountry);
                        System.out.println("Case Category: Mild");
                        break;
                    } else if (totalOfYes > 14) {
                        System.out.println("\nEND OF YOUR QUARANTINE");
                        System.out.println("Result:\nName: " + name + "\nContact Number: " + contactNumber + "\nEmail Address: " + emailAddress);
                        System.out.println("Place of Origin: " + specificCountry);
                        System.out.println("Case Category: Severe");
                        break;
                    }

                } 

                else {
                    String yes = "a";
                    String no = "b";
                    byte z = 0;

                    while (z < 3) {

                        String again;
                        System.out.print("\nFill up the form again?\nA.Yes,please\nB.No.Thanks\nEnter choice:");
                        again = br.readLine();

                        if (again.equalsIgnoreCase(yes)) {
                            z += 3;
                            y += 0;
                        } else if (again.equalsIgnoreCase(no)) {
                            z += 3;
                            c += 3;
                            y += 3;
                            break;
                        } else {
                            System.out.println("Invalid Input");
                            c += 0;
                            y += 0;
                        }
                    }
                }
            } 

       else {
            System.out.println("Sorry,you need to provide all neccessary details above.");
            int x = 0;
            String yes = "a";
            String no = "b";

            while (x < 3) {
                String again;
                System.out.print("\nFill up the form again?\nA.Yes,please\nB.No.Thanks\nEnter choice:");
                again = br.readLine();

                if (again.equalsIgnoreCase(yes)) {
                    x += 3;
                    c += 0;
                } else if (again.equalsIgnoreCase(no)) {
                    x += 3;
                    c += 3;
                    break;
                } else {
                    System.out.println("Invalid Input");
                    c += 0;
                }

            }
        }
    }
    }
}
