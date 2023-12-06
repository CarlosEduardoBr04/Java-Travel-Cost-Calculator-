# Java Travel Cost Calculator 🚗💸

## Project Overview 🌐

Discover the Java Travel Cost Calculator project, featuring the `Percurso` and `Custo` classes. The `Principal` class acts as the entry point, offering an interactive menu to register, display, and calculate the total cost of a journey. Dive into Java programming with this practical travel cost management system.

## `Percurso` Class 🗺️

### Key Features:

- **Attributes:**
  - `KmPercorrido`, `ValorCombustivel`, `ValorPedagio`: Store information about the journey.

- **Constructors:**
  1. `public Percurso()`: Initializes a default `Percurso` object.
  2. `public Percurso(double KmPercorrido, double ValorCombustivel, double ValorPedagio)`: Creates a `Percurso` with specific values.

- **Methods:**
  1. `CadastarPercurso()`: Captures input via `JOptionPane` to register journey details.
  2. `ListarPercurso()`: Displays a message with journey details.

## `Custo` Class 💰

### Key Features:

- **Attributes:**
  - `TotalPercurso`: Stores the total cost of the journey.

- **Constructors:**
  1. `public Custo()`: Initializes a `Custo` object with a default total cost of 0.0.
  2. `public Custo(double TotalPercurso)`: Creates a `Custo` with a specific total cost.

- **Methods:**
  1. `CalcularViagem(Percurso p)`: Accepts a `Percurso` object as a parameter, calculates the total journey cost, and displays the result via `JOptionPane`.

## `Principal` Class Operation 🚀

### Main Method:

- `main(String[] args)`: Entry point of the program. Creates instances of `Percurso` (`per`) and `Custo` (`c`), orchestrates an interactive menu, and integrates functionality.

## Author 👨‍💻

- [CarlosEduardoBr04](https://github.com/CarlosEduardoBr04) 🚀

## Usage and Contribution 🤝

1. **Clone the Repository:**
   - Begin by cloning the repository.

2. **Explore and Execute:**
   - Integrate the classes into your Java project and run the `Principal` class to interact with the travel cost calculator.

3. **Contribute:**
   - Enhance your Java skills by contributing to this project. Suggestions and improvements are encouraged.

## License 📜

This project operates under the MIT License. Refer to the [LICENSE](LICENSE) file for detailed information.

---

Embark on a journey of Java programming with the Travel Cost Calculator project. Whether you're a beginner or an experienced developer, this project offers practical insights into managing travel expenses. Safe travels! 🚗💸🌐
