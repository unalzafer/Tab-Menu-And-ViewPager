package unalzafer.tabmenus;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int numberPage;
    public PagerAdapter(FragmentManager fm,int numberPage){
        super(fm);
        this.numberPage=numberPage;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Menu1 menu1=new Menu1();
                return menu1;
            case 1:
                Menu2 menu2=new Menu2();
                return menu2;
            case 2:
                Menu3 menu3=new Menu3();
                return menu3;
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return numberPage;
    }
}
