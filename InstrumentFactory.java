
class InstrumentFactory {
    public Instrument createInstrument(String type) {
        if ("guitar".equalsIgnoreCase(type)) {
            return new Guitar();
        } else if ("piano".equalsIgnoreCase(type)) {
            return new Piano();
        } else {
            throw new IllegalArgumentException("\n" +
                    "Wrong choice of tool.");
        }
    }
}
