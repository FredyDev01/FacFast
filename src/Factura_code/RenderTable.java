package Factura_code;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class RenderTable extends DefaultTableCellRenderer{
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        DefaultTableCellRenderer Header = ((DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer());
        Header.setHorizontalAlignment(JLabel.CENTER);
        table.getTableHeader().setFont(Header.getFont().deriveFont(14f));
        table.getColumnModel().getColumn(1).setPreferredWidth(200);
        table.setRowHeight(25);
        setHorizontalAlignment(JLabel.CENTER);
        setBackground(Color.white);
        
        if(value instanceof JCheckBox){
            JCheckBox jCheckbox = (JCheckBox) value;
            return jCheckbox;
        }
        
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        return this;
    }
}
