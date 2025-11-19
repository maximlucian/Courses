package Tests;

class InterfaceProblem implements T1, T2 {
        public void m1() {
        }
    }

    interface T1 {
        int VALUE = 1;

        void m1();
    }

    interface T2 {
        int VALUE = 2;

        void m1();
    }

