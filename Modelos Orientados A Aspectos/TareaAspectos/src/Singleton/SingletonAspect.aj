package Singleton;

public aspect SingletonAspect {
    private Object instance = null;

    pointcut singletonCreation(): call(Logger.new());

    Object around(): singletonCreation() {
        if (instance == null) {
            instance = proceed(); // Crea la instancia si aún no existe
        }
        return instance; // Devuelve la única instancia
    }
}
