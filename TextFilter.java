import java.util.Scanner;

/**
 * TODO: DESCRIBE YOUR PROJECT HERE
 *
 * @author Aditya Sharma, sharm280@purdue.edu
 * @version 02/08/18
 */
public class TextFilter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Print hello message
        System.out.println("Welcome to TextFilter!");

        // Value to keep track of if the user wants to keep filtering text
        boolean keepFiltering;

        do {
            // Print options for the user to select
            System.out.println("Please select one of the following filtering options: \n");
            System.out.println("1. Filter Word\n" +
                    "2. Find-And-Replace\n" +
                    "3. Censor Information");

            // Save their choice
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

                // PART 1 - Censoring Words


                String passage = "";  // The text to be filtered
                System.out.println("Please enter the passage you would like filtered: ");

                // TODO: PART 1 - Ask the user for a passage to censor
                passage=scanner.nextLine();

                String word;  // The word to be censored from the text phrase
                System.out.println("Please enter the word you would like to censor: ");

                // TODO: PART 1 - Ask the user for a word to censor
                word=scanner.nextLine();

                System.out.println("Uncensored: ");
                System.out.println(passage);

                // TODO: PART 1 - Implement your parsing here
                String parsedPassage="";

                for(int j=0;j<word.length();j++)
                {
                    parsedPassage=parsedPassage+"X";
                }

                passage=" "+passage+" ";
                String pehlaWord=" "+word+".";
                String dosraWord=" "+word+"?";
                String teesraWord=" "+word+",";
                String chauthaWord=" "+word+"!";
                String pachwaWord=" "+word+" ";

                if(passage.contains(pachwaWord))
                {
                    passage=passage.replace(pachwaWord," "+parsedPassage);
                }
                if(passage.contains(pehlaWord))
                {
                    passage=passage.replace(pehlaWord," "+parsedPassage+".");
                }
                if(passage.contains(dosraWord))
                {
                    passage=passage.replace(dosraWord," "+parsedPassage+"?");
                }
                if(passage.contains(teesraWord))
                {
                    passage=passage.replace(teesraWord," "+parsedPassage+",");
                }
                if(passage.contains(chauthaWord))
                {
                    passage=passage.replace(chauthaWord," "+parsedPassage+"!");
                }

                passage=passage.trim();
                /*
                int position = passage.indexOf(word);
                while(position!=-1)
                {

                    //for(int z=position;z<word.length();z++)
                    //{
                    //    int space=0;
                    //    if(passage.charAt(z)==' ')
                    //    {
                    //        z=space;
                    //    }
                    //}
                    position = passage.indexOf(word, position);
                }38
                */
//                passage=passage.replaceAll('\\bword',);
                System.out.println("Censored: ");
                System.out.println(passage);


            } else if (choice == 2) {

                // PART 2 - Replacing Words


                String passage = "";  // The text to be filtered
                System.out.println("Please enter the passage you would like filtered: ");


                // TODO: PART 2 - Ask the user for a passage to filter
                passage=scanner.nextLine();

                String replace;  // The word to be filtered from the text phrase
                System.out.println("Please enter the word you would like to replace: ");

                //TODO: PART 2 - Ask the user for a word to replace
                replace=scanner.nextLine();

                String insert;  // The word to be inserted in the text phrase
                System.out.println("Please enter word you would like to insert: ");

                //TODO: PART 2 - Ask the user for a word to insert
                insert=scanner.nextLine();

                System.out.println("Uncensored: ");
                System.out.println(passage);


                // TODO: PART 2 - Implement your parsing here

                passage=passage.replaceAll(replace,insert);
                System.out.println("Censored: ");
                System.out.println(passage);



            } else if (choice == 3) {

                // PART 3 - Censoring Personal Information


                /*
                 * DO NOT ALTER THIS CODE! This formatting is imperative to the completion of this task.
                 *
                 * Keep asking for input until the user enters an empty line
                 * If they enter an empty line and the phrase is empty, keep waiting for input
                 */
                String passage = "";  // String for holding text to be filtered

                System.out.println("Please enter the phrase you would like to censor information from: ");

                while (true) {

                    // Obtain a line from the user
                    String temp = scanner.nextLine();

                    if (!passage.isEmpty() && temp.isEmpty()) {
                        break;
                    } else if (passage.isEmpty() && temp.isEmpty()) {
                        continue;
                    }


                    // Add the contents of temp into the phrase
                    passage += temp;


                    // Append a newline character to each line for parsing
                    // This will separate each line the user enters
                    // To understand how input is formatted in Part 3, please refer to the handout.
                    passage += '\n';
                }

                // Print the uncensored passage
                System.out.println("Uncensored: ");
                System.out.println(passage);
                String newPassage="";

                // TODO: PART 3 - Implement your parsing here
                String arr[]=passage.split("\\n+");
                for(int i=0;i<arr.length;i++)
                {
                    if(arr[i].charAt(0)=='N')
                    {
                        char arr1[]=arr[i].toCharArray();
                        for(int j=7;j<arr1.length-1;j++)
                        {
                            if(arr1[j]!=' ')
                            {
                                arr1[j]='*';
                            }
                        }
                        arr[i]="";
                        for(int x=0;x<arr1.length;x++)
                        {
                            arr[i]=arr[i]+arr1[x];
                        }
//                        System.out.println(arr);
//                        for(int j=7;j<arr[i].length()-1;j++)
//                        {
//                            if(arr[i].charAt(j)!=' ') {
//                                emptyspace=j;
//                                star1 = star1 + "*";
//                                break;
//                            }
//                        }
//
//                        for(int j=emptyspace+1;j<arr[i].length()-1;j++)
//                        {
//                            star2 = star2 + "*";
//                        }
//
//                        arr[i]=arr[i].substring(0,7)+star1+" "+star2+arr[i].charAt(arr[i].length()-1);
                    }

                    if(arr[i].charAt(0)=='E')
                    {
                        char arr2[]=arr[i].toCharArray();

                        int attherate=0;
                        int dot=0;
                        for(int j=8;j<arr2.length-4;j++)
                        {
                            if(arr2[j]=='@')
                            {
                                attherate=j;
                            }
//                            if(arr2[j]=='.')
//                            {
//                                dot=j;
//                            }
                        }
                        for(int j=8;j<arr2.length;j++)
                        {
                            if(arr2[j]=='.')
                            {
                                dot=j;
                            }
                        }
                        for(int j=8;j<dot;j++)
                        {
                            if(!(j==attherate||j==attherate+1))
                            {
                                arr2[j]='*';
                            }
                        }
                        arr[i]="";
                        for(int x=0;x<arr2.length;x++)
                        {
                            arr[i]=arr[i]+arr2[x];
                        }
                    }
                    if(arr[i].charAt(0)=='P')
                    {
                        char arr3[]=arr[i].toCharArray();
                        for(int t=7;t<arr3.length-5;t++)
                        {
                            if(arr3[t]!='-')
                            {
                                arr3[t]='*';
                            }
                        }
                        arr[i]="";
                        for(int x=0;x<arr3.length;x++)
                        {
                            arr[i]=arr[i]+arr3[x];
                        }
                    }

                    newPassage=newPassage+arr[i]+"\n";
                }
//                System.out.println(arr);
//                for(int i=0;i<passage.length();i++)
//                {
//                    if(passage.charAt(i)==('\n'))
//                    {
//                        String newstring=passage.substring(0,i);
//                        String namecheck=passage.substring(0,4);
//                        String nayaNaam="";
//                        String changeNaam="";
//                        if(namecheck.equals("Name"))
//                        {
//
//                            changeNaam=passage.substring(5);
//                            for(int j=0;j<changeNaam.length()-5;j++)
//                            {
//                                int space=0;
//                                if(changeNaam.charAt(j)==' ')
//                                {
//                                    space=j;
//                                }
//                                String stars1="";
//                                for(int m=0;m<space;m++)
//                                {
//                                    stars1=stars1+"*";
//                                }
//                                String stars2="";
//                                for(int x=space+1;x<changeNaam.length();x++)
//                                {
//                                    stars2=stars2+"*";
//                                }
//                                changeNaam=changeNaam.substring(0,1)+stars1+" "+stars2+changeNaam.substring(changeNaam.length()-1);
//                            }
//
//                        }
//                        nayaNaam=namecheck+changeNaam;
//                        passage="";
//                        passage=nayaNaam;
//                    }
//                }

                // Print the censored passage
                System.out.println("Censored: ");
                System.out.println(newPassage);

            } else {

                // They entered a number that was not 1, 2 or 3
                System.out.println("The option you chose was invalid!");

            }


            System.out.println("Would you like to keep filtering? Yes/No");

            // TODO: PART 4 - Update the value of keepGoing accordingly
            // TODO: PART 4 - Replace the line below with your code
            String reply="";
            do {
                keepFiltering = false;
                reply=scanner.nextLine().toLowerCase();
                if(reply.equals("yes"))
                {
                    keepFiltering=true;
                }
            }while(reply.length()==0);
        } while (keepFiltering);

        System.out.println("Thank you for using TextFilter!");

    }

}
