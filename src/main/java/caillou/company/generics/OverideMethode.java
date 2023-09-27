package caillou.company.generics;

import java.util.ArrayList;
import java.util.List;

public class OverideMethode {

    class Crate {

// Avec cette méthode, List<SpecialCrate> n'étend pas List<Crate> même si SpecialCrate étend Crate
//        public List<Crate> getCrates(){
//            return new ArrayList<Crate>();
//        }

        public List<? extends Crate> getCrates(){
            return new ArrayList<Crate>();
        }

    }

    class SpecialCrate extends Crate {

        public ArrayList<SpecialCrate> getCrates(){
            return new ArrayList<SpecialCrate>();
        }

    }


}
