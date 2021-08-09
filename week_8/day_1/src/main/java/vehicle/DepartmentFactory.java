package vehicle;

public class DepartmentFactory {


    public static Department createDepartment(DepartmentEnum departmentEnum) {

        Department department = null;

        if (departmentEnum == null) {
            return null;
        }

        switch (departmentEnum) {
            case SERVICE:
                department = new ServiceDepartment();
                break;
            case SALES:
                department = new SalesDepartment();
                break;
            case FINANCE:
                department = new FinanceDepartment();
                break;
            default:
                System.out.println("I did not understand that input");
        }

        return department;

    }

}
