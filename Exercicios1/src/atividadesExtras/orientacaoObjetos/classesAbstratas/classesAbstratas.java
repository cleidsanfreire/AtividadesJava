package atividadesExtras.orientacaoObjetos.classesAbstratas;
/*
9. Classes Abstratas: Crie uma classe abstrata chamada Animal com
métodos abstratos como som() e mover(). Crie classes concretas
como Cachorro e Gato que herdam de Animal e implementam esses
métodos.
 */
public class classesAbstratas {
    public static void main(String[] args) {
        Gato gt = new Gato();
        gt.som();
        gt.mover();

        Cachorro c1 = new Cachorro();
        c1.som();
        c1.mover();
    }
}
