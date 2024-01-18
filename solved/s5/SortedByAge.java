package solved.s5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 3
 * 21 Junkyu
 * 21 Dohyun
 * 20 Sunyoung
 * 나이가 같으면 먼저 가입한 사람
 * */

class Person implements Comparable<Person>{
    int age;
    String name;
    Person(int age, String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public int compareTo(Person o) {
        if(this.age != o.age) return this.age - o.age;
        else return 0;
    }
}
public class SortedByAge {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        ArrayList<Person> pArr = new ArrayList<>();

        int person = Integer.parseInt(br.readLine());
        for(int i = 0; i < person; i++){
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            Person p = new Person(age, name);
            pArr.add(p);
        }
        Collections.sort(pArr);

        for(Person p : pArr){
            System.out.println(p.age + " " + p.name);
        }
    }
}
