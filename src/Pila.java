import java.util.Stack;

public class Pila {

    //private Stack pila; --> Referencia a Stack
    // Puede almacenar cualquier tipo de dato
    private Stack <Integer> pila; //Solo pueden ser de tipo entero
    // Por eso se pone la clase Integer

    public Pila() {
        pila= new Stack <Integer>();
    }


    // INSERTAR DATOS --> Push
    public void insertar(Integer dato){ //Se pasa como parametro el tipo de dato
        pila.push(dato);
    }

    //ELIMINAR DATOS --> Pop
    //Tiene que devolver el tipo de dato por eso es Integer

    public Integer eliminar() throws Exception {
        if(pila.empty())
            throw new Exception("Pila sin elementos");
        return pila.pop();
    }


    //Consultar ubi del ultimo indice insertado --> Peek
    public Integer consultarTope() throws Exception{
        if(pila.empty())
            throw new Exception("Pila sin elementos");
        return pila.peek();
    }

    //Imprime desde el ultimo hasta el primero LIFO
    // toString transforma el objeto a una sola cadena, como quiero que se impriman datos
    //El objeto es una coleccion de elementos
    // pila.size() me va a dar 3 si ingreso 3 datos, pero necesito que sea -1 para que saque el ultimo elemento
    // recordando que inicia desde cero el ultimo elemento seria 2
    // por eso: int i=pila.size()-1
    // primer elemento es cero, por eso i>=0
    @Override
    public String toString() {
        String resultado= "===PILA===\n";
        for (int i=pila.size()-1; i>=0; i--){
            resultado +=pila.get(i)+"\n";
        }
        return resultado;
    }
}
