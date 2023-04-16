public class Customer {
    private String id;
    private String name;
    private String type;

    public Customer(String id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type.equals("normal") || type.equals("premier")) {
            this.type = type;
        } else {
            System.out.println("Customer type must be either normal or premier");
        }
    }
}