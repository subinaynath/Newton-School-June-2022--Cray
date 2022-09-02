static class Student
{
    //Enter your code here
    String name;
    int eng;
    int maths;
    int hindi;
}
static Student[] createStudentArray(int n)
    {
       //Enter your code here
       Student[] st = new Student[n];

       for(int i=0; i<n; i++){
           Student student = new Student();
           student.name=sc.next();
           student.eng=sc.nextInt();
           student.maths=sc.nextInt();
           student.hindi=sc.nextInt();

           st[i] = student;
       }
       return st;
    }
    
    static int engAverage(Student st[], int n)
    {
        //Enter your code here
        int total=0;
        for(int i=0;i<n;i++){
            total += st[i].eng;
        }
        return total/n;
    }
    
    static int avgPercentageOfClass(Student st[], int n)
    {
        //Enter your code here
        int total=0;
        for(int i=0;i<n;i++){
            int totalSub=0;
            totalSub += st[i].eng + st[i].maths + st[i].hindi;
            totalSub /=3;
            total +=totalSub;
        }
        return (total/(n));
    }
