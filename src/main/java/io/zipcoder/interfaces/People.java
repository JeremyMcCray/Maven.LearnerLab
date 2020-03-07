package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {
    List<Person> personList = new ArrayList<Person>();

    public void adder(Person personToAdd){
        personList.add(personToAdd);
    }

    public Person findByID(long idNumber){
        Person answer = new Person(-1,null);
        for (Person element:personList) {
            if(element.getId().equals(idNumber)){
            answer = element;
            }
        }
        return answer;
    }

    public Boolean contains(Person person){
        for (Person element: personList) {
            if(person.getId().equals(element.getId()))
                return true;
            }
        return false;
    }

    public void remover(Person person){
        if(personList.contains(person)){
            personList.remove(person);
        }
    }

    public void removeByID(long idNumber){
        for (Person element: personList) {
            if(element.getId() == idNumber){
                personList.remove(element);
            }
        }
    }

    public void removeAll(){
        personList.clear();

    }

    public Integer count(){
        return personList.size();

    }

    public Person[] toArray(){
        return (Person[]) personList.toArray();
    }

    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }

}
