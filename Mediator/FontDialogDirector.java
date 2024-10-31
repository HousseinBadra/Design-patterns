package Mediator;

class FontDialogDirector extends DialogDirector {

    @Override
    protected void createWidgets() {
        this._ok = new Button(this);
        this._cancel = new Button(this);
        this._fontList = new ListBox(this);
        this._fontName = new EntryField(this);

    }

    @Override
    void showDialog() {

    }

    @Override
    void widgetChanged(Widget widget) {
        if (widget == this._fontName) {
            this._fontName.SetText(_fontList.GetSelection());
        } else if (widget == this._ok) {

        } else if (widget == this._cancel) {

        }
    }

    private Button _ok;
    private Button _cancel;
    private ListBox _fontList;
    private EntryField _fontName;
};

// public:
// FontDialogDirector();
// virtual "FontDialogDirector();
// virtual void WidgetChanged(Widget*);
// protected:
// virtual void CreateWidgets();
// private: