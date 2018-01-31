package generics.twotypes;

public class GenericInterfaceTwoTypesImplExactTypes
    implements GenericInterfaceTwoTypes<Integer, String> {

  @Override
  public String perform(Integer value) {
    return value.toString();
  }
}
