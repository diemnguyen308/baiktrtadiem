package Baiktra;

    public class Kythuat extends Nhanvien {
        private String Major;

        public Kythuat() {
        }

        @Override
        public String moTaCongViec() {
            return Major;
        }
        public Kythuat(String id) {
            super(id);
        }

        public Kythuat(String id, String name, String dob, String address, String major) {
            super(id, name, dob, address);
            Major = major;
        }

        public String getMajor() {
            return Major;
        }

        public void setMajor(String major) {
            Major = major;
        }

        @Override
        public String toString() {
            return "Kythuat[" + super.toString() +"Major='" + Major + '\'' +
                    ']';
        }
}
