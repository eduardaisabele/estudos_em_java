package treinando_classes.classe_empresa;

public class EmpresaLima {
    public static void main(String[] args) {
        ClasseEmpresa empresaLima = new ClasseEmpresa();

        empresaLima.setNomeEmpresa("Empresa Lima");
        empresaLima.setCnpj(722334106);
        empresaLima.setDepartamentos("Alimentos");

        System.out.println(empresaLima.getNomeEmpresa());
        System.out.println(empresaLima.getCnpj());
        System.out.println(empresaLima.getDepartamentos());

    }
}
