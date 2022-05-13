package Temperature;

import javax.swing.*;
import java.awt.*;

public class MyListCellRenderer implements ListCellRenderer<String> {

    @Override
    public Component getListCellRendererComponent(JList<? extends String>
                                                  list, String value, int index,
                                                  boolean isSelected, boolean cellHasFocus){
        JLabel temp = new JLabel(value);

        MyListModel myListModel = (MyListModel) list.getModel();

        if(myListModel.getCelsius(index) < 6)
            temp.setForeground(Color.BLUE);
        if(myListModel.getCelsius(index) > 25)
            temp.setForeground(Color.RED);

        return temp;
    }
}
