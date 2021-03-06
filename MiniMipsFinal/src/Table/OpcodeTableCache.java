package Table;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class OpcodeTableCache {

    ArrayList<OpcodeTableRow> opcodeTableRows = new ArrayList();
    DefaultTableModel model;
    
    public OpcodeTableCache(int insSize, DefaultTableModel opcodeTableModel) {
        this.model=opcodeTableModel;
        for (int x = 0; x < insSize; x++) {
            this.opcodeTableRows.add(new OpcodeTableRow((this.model.getValueAt(x, 0).toString()),(this.model.getValueAt(x, 1).toString()),(this.model.getValueAt(x, 2).toString()),(this.model.getValueAt(x, 3).toString()),(this.model.getValueAt(x, 4).toString()),(this.model.getValueAt(x, 5).toString())));
        }
    }
    public OpcodeTableRow geOpcodeRow(int insnumber){
        return this.opcodeTableRows.get(insnumber);
    }
}
