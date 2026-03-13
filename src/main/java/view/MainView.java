package view;

import interface_adapter.quotes.QuotesController;
import interface_adapter.quotes.QuotesViewModel;
import interface_adapter.quotes.QuotesPresenter;
import interface_adapter.quotes.QuotesState;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class MainView extends JPanel implements ActionListener, PropertyChangeListener {

    private final String viewName = "Main View";
    private final QuotesViewModel quotesViewModel;

    private final JButton icon;
    private final JLabel date;
    private final JLabel time;

    private final JLabel quote;
    private QuotesController quotesController;

    public MainView(MainView mainView) {
        this.quotesViewModel = mainView.quotesViewModel;
        this.quotesViewModel.addPropertyChangeListener(this);

    }

    public MainView(QuotesViewModel quotesViewModel) {
        this.quotesViewModel = quotesViewModel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {

    }
}
