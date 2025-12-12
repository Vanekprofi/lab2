public class Name {
    private String surname;
    private String firstName;
    private String patronymic;

    public Name(String surname, String firstName, String patronymic) {
        this.surname = surname;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (surname != null && !surname.isEmpty()) {
            sb.append(surname);
        }
        if (firstName != null && !firstName.isEmpty()) {
            if (sb.length() > 0) sb.append(" ");
            sb.append(firstName);
        }
        if (patronymic != null && !patronymic.isEmpty()) {
            if (sb.length() > 0) sb.append(" ");
            sb.append(patronymic);
        }

        return sb.toString();
    }
}