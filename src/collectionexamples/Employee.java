package collectionexamples;

import java.util.Objects;

class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id); // Generates a unique hash
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Same memory reference
        if (obj == null || getClass() != obj.getClass()) return false; // Type check

        Employee emp = (Employee) obj;
        return id == emp.id && name.equals(emp.name); // Field comparison
    }
}
