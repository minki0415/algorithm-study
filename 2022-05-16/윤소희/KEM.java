//https://www.acmicpc.net/problem/10825

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class KEM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Student[] students = new Student[N];

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");

            students[i] = new Student(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]), Integer.parseInt(s[3]));
        }

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.ko != s2.ko) {
                    return s2.ko - s1.ko;

                } else if (s1.en != s2.en) {
                    return s1.en - s2.en;

                } else if (s1.ma != s2.ma) {
                    return s2.ma - s1.ma;

                } else {
                    return s1.name.compareTo(s2.name);

                }
            }
        });

        for (Student s : students) {
            System.out.println(s.name);
        }

        br.close();
    }
}

class Student {
    String name;
    int ko;
    int en;
    int ma;

    public Student(String name, int ko, int en, int ma) {
        this.name = name;
        this.ko = ko;
        this.en = en;
        this.ma = ma;
    }
}
