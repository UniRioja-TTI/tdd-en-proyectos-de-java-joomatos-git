package com.tt1.test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBStub {
/**
 * Esta clase representa la base de datos.
 * 
 * @author JOOMATOS
 * @version 1.0
 */


    private Map<String, ToDo> tareas = new HashMap<>();
    private List<String> mails = new ArrayList<>();


	/**
     * Este método incluye una nueva tarea en el Map tareas.
     * 
     * @param todo. La tarea a introducir en el HashMap.
     */
    public boolean createTarea(ToDo todo) {
        if (todo == null || todo.getNombre() == null) return false;
        tareas.put(todo.getNombre(), todo);
        return true;
    }

	/**
     * Este método devuelve una tarea del Map tareas.
     * 
     * @param nombre. El nombre de la tarea a obtener del HashMap.
	 * @return Devuelve la tarea con el nombre, o falso si no existe.
     */
    public ToDo getTarea(String nombre) {
        return tareas.get(nombre);
    }

	/**
     * Este método lista todas las tareas.
     * 
	 * @return Devuelve una lista de tareas
     */
    public List<ToDo> listTareas() {
        return new ArrayList<>(tareas.values());
    }

	/**
     * Este método actualiza una tarea.
     * 
     * @param todo El ToDo que sobreescribirá la tarea original. 
	 * @return Si no existía ninguna tarea con el mismo nombre que el de entrada, devuelve falso. Si no, verdadero.
     */
    public boolean updateTarea(ToDo todo) {
        if (!tareas.containsKey(todo.getNombre())) return false;
        tareas.put(todo.getNombre(), todo);
        return true;
    }

	/**
     * Este método elimina una tarea del Map tareas.
     * 
     * @param nombre. El nombre de la tarea a sacar del HashMap.
	 * @return devuelve true si se ha eliminado, false si no.
     */
    public boolean deleteTodo(String nombre) {
        return tareas.remove(nombre) != null;
    }

	/**
     * Este método incluye una nueva tarea en el Map tareas.
     * 
     * @param email. El email a introducir en el arrayList. String.
     */
    public boolean createMail(String email) {
        if (email == null || email.isEmpty()) return false;
        mails.add(email);
        return true;
    }

	/**
     * Este método lista todas los emails.
     * 
     */
    public List<String> getMails() {
        return new ArrayList<>(mails);
    }
}