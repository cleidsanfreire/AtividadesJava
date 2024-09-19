package atividadesExtras.orientacaoObjetos.classesAbstratas;

public class Gato extends Animal{
    @Override
    public void som() {
        System.out.println("Miau miau");
    }

    @Override
    public void mover() {
        System.out.println("Gato se movendo");
    }
}
