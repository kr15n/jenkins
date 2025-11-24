pipeline {
    agent any // Menentukan di mana pipeline akan berjalan

    stages {
        // Tahap Awal: Wajib dilakukan
        stage('Checkout') {
            steps {
                // Di sini, Jenkins secara otomatis akan mengambil kode terbaru
                // dari repository GitHub yang terhubung ke Job Jenkins ini.
                // Kamu tidak perlu menulis perintah 'git clone' secara eksplisit di sini
                // jika menggunakan fitur SCM (Source Code Management) dari Jenkins.
                echo 'Checking out code from GitHub...' 
                // Jika ingin spesifik menggunakan 'checkout scm' (direkomendasikan):
                checkout scm 
            }
        }

        // Tahap B: Kompilasi dan Persiapan Aplikasi
        stage('Build') {
            steps {
                echo 'Starting application build...'
                // Ganti dengan perintah build yang sesuai dengan teknologi kamu (misalnya, Maven, Gradle, npm)
                // Contoh untuk aplikasi Java dengan Maven:
                // sh 'mvn clean package'
            }
        }

        // Tahap C: Menjalankan Tes Otomatis
        stage('Test') {
            steps {
                echo 'Running automated tests...'
                // Ganti dengan perintah untuk menjalankan test (misalnya, unit tests, integration tests)
                // Contoh:
                // sh 'mvn test'
            }
        }

        // Tahap D: Pengerahan (Deployment) ke Server Produksi
        stage('Deploy') {
            steps {
                echo 'Deploying application to production server...'
                // Di sini kamu menggunakan SSH atau metode lain untuk mentransfer file build 
                // ke server tujuan dan me-restart layanan.
                // Contoh transfer via SSH menggunakan `sshAgent` (membutuhkan plugin):
                // sshagent (credentials: ['ssh-key-id']) {
                //    sh 'scp target/app.jar user@server_ip:/path/to/server/'
                //    sh 'ssh user@server_ip "sudo systemctl restart myapp"'
                // }
            }
        }
    }
}
