# Base Kotlin Multiplatform Project
kotlin multiplatform project. implement common domain usecase android and iOS

```
 src
│       ├── androidMain
│       │   ├── AndroidManifest.xml
│       │   ├── kotlin
│       │   │   └── com
│       │   │       └── github
│       │   │           └── ariefannur
│       │   │               └── base
│       │   │                   └── common
│       │   │                       ├── actual.kt
│       │   │                       └── Dispatcher.kt
│       │   └── res
│       ├── commonMain
│       │   └── kotlin
│       │       └── com
│       │           └── github
│       │               └── ariefannur
│       │                   └── base
│       │                       └── common
│       │                           ├── base
│       │                           │   ├── BaseRequest.kt
│       │                           │   ├── BaseResponse.kt
│       │                           │   ├── BaseUseCase.kt
│       │                           │   └── ValidateResponse.kt
│       │                           ├── common.kt
│       │                           ├── datasource
│       │                           │   └── remote
│       │                           │       ├── MovieApi.kt
│       │                           │       └── MovieRemoteDataSource.kt
│       │                           ├── di
│       │                           ├── Dispatcher.kt
│       │                           ├── domain
│       │                           │   ├── model
│       │                           │   │   ├── ListMovies.kt
│       │                           │   │   └── Movie.kt
│       │                           │   ├── request
│       │                           │   │   ├── GetDetailMovieRequest.kt
│       │                           │   │   └── GetPopularRequest.kt
│       │                           │   └── usecase
│       │                           │       ├── GetDetailMovie.kt
│       │                           │       └── GetPopularMovie.kt
│       │                           └── repository
│       │                               ├── AbstractMovieRepository.kt
│       │                               └── MovieRepository.kt
│       └── iosMain
│           └── kotlin
│               └── com
│                   └── github
│                       └── ariefannur
│                           └── base
│                               └── common
│                                   ├── actual.kt
│                                   └── Dispatcher.kt
```
