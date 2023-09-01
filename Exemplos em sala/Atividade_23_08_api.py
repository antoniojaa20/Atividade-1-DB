import requests
import csv

csv_file = "data.csv"
data = [["Title", "Year"]]

requisicao = requests.get("http://www.omdbapi.com/?i=tt3896198&apikey=821cf1e1")

print(requisicao)
print(requisicao.json())

try:
    with open(csv_file, mode='w', newline='') as file:
        writer = csv.writer(file)
        writer.writerow(["Title", "Year"])  # Header
        writer.writerows(data)
    print("CSV file created successfully!")
except Exception as e:
    print(e)
