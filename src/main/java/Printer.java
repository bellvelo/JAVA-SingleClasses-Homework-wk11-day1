public class Printer {

    private int sheets;
    private int toner;

    public Printer(int sheets, int toner) {
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheetCount() {
        return this.sheets;
    }

    public int getTonerLevel() {
        return this.toner;
    }

    public char canPrint(int pages, int copies) {

        int printJob = pages * copies;

        if (printJob <= this.sheets && printJob <= this.toner) {
            this.sheets -= printJob;
            this.toner -= printJob;
            return 'Y';
        }
        return 'N';
    }

    public int refillPaper(int newSheets) {
        int capacity = 250;
        if (this.sheets + newSheets <= capacity) {
            return (this.sheets += newSheets);
        }
        return this.sheets;

    }

}