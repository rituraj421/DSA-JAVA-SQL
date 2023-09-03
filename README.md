<hr color="green"> 

# Java Course from Scratch to Master with <u>DSA problems </u> from Leetcode as well as <u>MySQL problems </u> From Leetcode

## A brief description of contents:

<hr>

- `Basics` (<u>Full basic course from youtube and other online platform</u>)
- `CLG` (<u>Problems which i did in my clg</u>)
- `CRASH`
- `coreJavaBook`(<u>contents from the core java textbook</u>)
- `Linkedin` (<u>Problems from the Linkedin learning section</u>)
- `Algorithms`
- `Arrays`
- `STACK`
- `SQL` (<u>It contains problems from leetcode for mysql as well as practice queries</u>)
- `leetcode` (<u>it contains problems from leetcode for DSA </u>)

<hr>

`CTRL` + `Shift` + `P` and type, `java clean`, and IDE will show you the suggestion tip for, `Java: Clean the Java language server workspace.` Upon selection, agree and restart the IDE. It will clean the language server workspace for you.

- Creating Package
 `javac -d .<file_name.java>` <!-- used to create package <name is specified in the .java file> -->
 `javac -d *.<.java>` <!-- used to add all files in the same package -->
 ` javac -d <folder name> * <.java>` <!-- her we r creating a folder where all u=our packages will be stored -->
<hr color="red">

<!-- 

 --below code is must to understand the difference between arr[i++] and arr[i]+=

int[] arr = {4,5,2,5,2,1,0,8,4,21,3,1,0};
        int[] naya = new int[arr.length];
        HashSet<Integer> set1 = new HashSet<>();
        for(int num: arr){
            set1.add(num);
        }
        int i = 0;
        for(int num : set1){
            naya[i]+= num;
            System.out.print(num+" ");
        }

 -->