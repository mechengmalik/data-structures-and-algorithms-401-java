package stack.queue;

public class AnimalShelter {
    Queue<Animal> cat = new Queue<>();
    Queue<Animal> dog = new Queue<>();


    public void  enqueue(Animal animal){
        if(animal instanceof Dog){
            dog.enqueue(animal);
        }else if( animal instanceof Cat){
            cat.enqueue((animal));
        }
    }

    public String dequeue(String pref){
        if(pref =="cat"){
            if(!this.cat.isEmpty()){
              this.cat.dequeue();
              return "cat";
            }
        }else if ((pref =="dog")){
            if (!this.dog.isEmpty()){
                this.dog.dequeue();
                return "dog";
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "cat=" + cat +
                ", dog=" + dog +
                '}';
    }
}
