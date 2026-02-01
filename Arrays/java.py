import requests

# Example Spotify API query
def get_track_details(track_name):
    url = f"https://api.spotify.com/v1/search?q={track_name}&type=track"
    headers = {"Authorization": "Bearer YOUR_TOKEN"}
    response = requests.get(url, headers=headers)
    data = response.json()
    track = data["tracks"]["items"][0]
    return {
        "name": track["name"],
        "key": track["key"],
        "tempo": track["tempo"],
        "popularity": track["popularity"]
    }

track_details = get_track_details("Track Name")
print(f"flag{{{track_details['name']}{track_details['key']}{track_details['tempo']}{track_details['popularity']}}}")