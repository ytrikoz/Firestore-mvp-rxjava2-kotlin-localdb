package firebase_info.com.realmfirestore.di.modules

import android.content.Context
import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class FirebaseModule {

    @Provides
    @Singleton
    fun providesFirestore(context: Context): FirebaseFirestore {
        // Set Up Firebase
        return FirebaseFirestore.getInstance()
    }

}