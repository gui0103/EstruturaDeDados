 public class Engenheiro extends Funcionario {

        private Double salario;

        public Engenheiro(String CPF, String nome, Double salario) {
            super(CPF, nome);
            this.salario = salario;
        }

        @Override
        public Double calcularSalario() {
            return salario;
        }

        @Override
        public String toString() {
            return "\nEngenheiro" +
                    "\nsalario = " + salario +
                    super.toString();
        }
    }

