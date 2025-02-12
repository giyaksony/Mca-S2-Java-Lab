public class Cpu {
    private double price;

    // Constructor
    public Cpu(double price) {
        this.price = price;
    }

    // Inner class Processor
    public class Processor {
        private int numberOfCores;
        private String manufacturer;

        public Processor(int numberOfCores, String manufacturer) {
            this.numberOfCores = numberOfCores;
            this.manufacturer = manufacturer;
        }

        public void displayProcessorDetails() {
            System.out.println("Processor Details:");
            System.out.println("Number of Cores: " + numberOfCores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    // Static nested class Ram
    public static class Ram {
        private int memory;
        private String manufacturer;

        public Ram(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        public void displayRamDetails() {
            System.out.println("RAM Details:");
            System.out.println("Memory: " + memory + " GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    public static void main(String[] args) {
        // Creating CPU object
        Cpu cpu = new Cpu(250.0);

        // Creating Processor object
        Cpu.Processor processor = cpu.new Processor(6, "Intel");
        processor.displayProcessorDetails();

        // Creating Ram object
        Cpu.Ram ram = new Cpu.Ram(16, "Corsair");
        ram.displayRamDetails();
    }
}

// Output
// Processor Details:
// Number of Cores: 6
// Manufacturer: Intel
// RAM Details:
// Memory: 16 GB
// Manufacturer: Corsair